import mysql.connector

cnx = mysql.connector.connect(user='david', password='password',
                                      host='127.0.0.1',
                                                                    database='enwiki')
cnx.close()
