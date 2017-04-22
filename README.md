# COMP303_JAVAEE_Survey_Website - Group 4

In order to run Survey website, please: 
1)Add Survey EAR to your Eclipse
2)Run the SQL file in MySQL to setup the SurveysDB database
3)Add database source to WildFly configuration 
4)Change <non-jta-source> item in persistence.xml to your data source name, ex: <non-jta-data-source>java:/jndi/SurveysDS</non-jta-data-source>
5)Run the project on WildFly server.