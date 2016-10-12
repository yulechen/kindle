/**
 * @FILE:Snippet.java
 * @AUTHOR:chenqiu
 * @DATE:2016年10月8日 下午1:50:13
 **/
package com.chinaway.kindle.mail;

import java.util.Date;

/*******************************************
 * @COMPANY:北京汇通天下科技有限公司
 * @CLASS:Snippet
 * @DESCRIPTION:	
 * @AUTHOR:chenqiu
 * @VERSION:v1.0
 * @DATE:2016年10月8日 下午1:50:13
 *******************************************/

public class Snippet {
    public static void main(String[] args){   
             //这个类主要是设置邮件   
          MailSenderInfo mailInfo = new MailSenderInfo();    
          mailInfo.setMailServerHost("smtp.163.com");    
          mailInfo.setMailServerPort("25");    
          mailInfo.setValidate(true);    
          mailInfo.setUserName("zaqw396056737");    
          mailInfo.setPassword("chenqiu ");//您的邮箱密码    
          mailInfo.setFromAddress("zaqw396056737@163.com");    
          mailInfo.setToAddress("wpty@kindle.cn");    
          mailInfo.setSubject("设置邮箱标题 如http://www.guihua.org 中国桂花网");    
          mailInfo.setContent("设置邮箱内容 如http://www.guihua.org 中国桂花网 是中国最大桂花网站==");    
             //这个类主要来发送邮件   
          SimpleMailSender sms = new SimpleMailSender();   
              sms.sendTextMail(mailInfo);//发送文体格式    
              //sms.sendHtmlMail(mailInfo);//发送html格式   
        }  
}  

