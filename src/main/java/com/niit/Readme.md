###Controllers 
 All the classes are annotated with @Controller and @RestController so that they can be scanned by spring MVC
 -	Navigation.java :  Contains MVC controller methods for basic navigation.
 -	Blog : Contains RestWebServices related to Blog.
 -  Chat : Contains RestWebServices related to Chat.
 -	Forum : Contains RestWebServices related to Forum.
 -	ForumComments : Contains RestWebServices related to ForumComments.
 -  Friend : Contains RestWebServices related to Friend.
 -  Job : Contains RestWebServices related to Job.
 -  Login : Contains RestWebServices related to Login.
 -	Users : Contains RestWebServices related to Users.
 
 ###Models
 Contains all model classes.These models will be scanned by hibernate, so as to facilitate easy data manipulation using Hibernate ORM.
 -  Blog.java		
 -  Event.java	
 -  ForumComment.java	
 -  Forum.java		
 -  Friend.java	
 -  Job.java
 -  Message.java
 -  OutputMessage.java
 -  Users.java
 
 
 ###DAO 
 Contains all DAO interfaces and DAOImpls containing RAW persistence Logic. 
 -  BlogDAO.java	
 -  BlogDAOImpl.java	
 -  EventDAO.java	
 -  EventDAOImpl.java	
 -  ForumCommentDAO.java	
 -  ForumCommentDAOImpl.java	
 -  ForumDAO.java	
 -  ForumDAOImpl.java	
 -  FriendDAO.java	
 -  FriendDAOImpl.java 
 
 
