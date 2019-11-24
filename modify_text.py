import pymysql
import pymysql.cursors
import re
import jieba
from jieba import analyse
import ngender
import sys
# 引入TF-IDF关键词抽取接口
tfidf = analyse.extract_tags

# 传入用户id，并从数据库获取此id 相关的呢称和评论内容
def get_info(userid):
    conn = pymysql.connect(host="118.25.133.235",user="analysys_club",password="YiGuanXYZ.@()85258638",db="douban_analysys",port=3306)
    cur = conn.cursor()
    sql = 'SELECT user_id,content,NAME FROM comment,user WHERE comment.user_id = user.id AND user.`id` = %s'
    cur.execute(sql,userid)
    data = cur.fetchall()
    conn.close()
    cur.close()
    return data

# 将内容处理，提取汉字，过长的评论内容先做分词提取关键字处理，返回规整内容
def get_word(data):
    pattern="[\u4e00-\u9fa5]+"
    regex = re.compile(pattern)
    data = list(data)
    for row in range(len(data)):
        data[row] = list(data[row])
        data[row][0] = ''.join(regex.findall(data[row][0]))
        data[row][1] = ''.join(regex.findall(data[row][1]))
        data[row][2] = ''.join(regex.findall(data[row][2]))
    return data


def analyses_sex(data):
    for row in range(len(data)):
        sex,sex1,sex2,score,score1,score2 ='','','',0,0,0
        try:
            if data[row][1]=='' and data[row][2]=='':
                sex,score = 'NULL',0
            elif data[row][1] =='':
                sex,score =ngender.guess(data[row][2])
            elif data[row][2]=='':
                sex,score =ngender.guess(''.join(tfidf(data[row][1])))
            else:
                sex1,score1 =ngender.guess(''.join(tfidf(data[row][1])))
                sex2,score2 =ngender.guess(data[row][2])
                if sex1==sex2:
                    sex,score = sex1,score1*0.7+score2*0.3
                elif score1*0.7>=score2*0.3:
                    sex,score = sex1,score1
                else:
                    sex,score = sex2,score2
        except Exception:
            pass
        data[row].append(sex)
        data[row].append(score)
        return data


if __name__ == '__main__':
    data = get_info(sys.argv[1])
    data2 = get_word(data)
    data3 = analyses_sex(data2)
    print(data3)

