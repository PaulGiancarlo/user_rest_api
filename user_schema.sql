
 CREATE TABLE user (ID INT, USER_NAME VARCHAR2(50), PASSWORD_USER VARCHAR2(50), PASSWORD VARCHAR2(20) , ID_PHONES INT, 
 CREATED DATE WHEN INSERT SYSDATE, MODIFIED DATE, LAST_LOGIN DATE WHEN INSERT SYSDATE, TOKEN VARCHAR2(250), ISACTIVE VARCHAR2(1)
);

CREATE TABLE phones (ID_PHONES INT , NUMBER_PHONE INT , CITYCODE INT , COUNTRYCODE INT);

