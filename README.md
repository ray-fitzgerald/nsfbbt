# nsfbbt
hackathon project 





notes:

to install IBM CLI use:  
`curl -fsSL https://clis.ng.bluemix.net/install/linux | sh`  


Login and use correct region:  
`ibmcloud login -a api.ng.bluemix.net`   
`ibmcloud api https://api.ng.bluemix.net`  

Build:  
`mvn package`  

Push to ibm cloud:    
`ibmcloud target --cf`  
`ibm cf push`  
