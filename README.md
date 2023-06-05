# Microservices_Project


#Pensioner Details Microservice

Run hello method by http://localhost:8081/

Run Add Details method by http://localhost:8081/add
input eg 1:
  {
    "aadhar":111122223333,
    "name":"utkarsh",
    "dob":"01/06/2000",
    "pan":"ABCDE1234F",
    "salaryEarned":10000,
    "allownces":1000,
    "pensionType":"Self",
    "bankName":"ABC",
    "accNo":123456789,
    "bankType":"Public"
   }

input eg 2:
  {
    "aadhar":444455556666,
    "name":"sumit",
    "dob":"21/08/2000",
    "pan":"GHIJK5678L",
    "salaryEarned":15000,
    "allownces":1200,
    "pensionType":"Family",
    "bankName":"DEF",
    "accNo":987654321,
    "bankType":"Private"
  }
  
Run Get All Details method by http://localhost:8081/alldetails

Run Get Details By Aadhar method by http://localhost:8081/111122223333

Run Update Details method by http://localhost:8081/update/111122223333
input eg :
  {
    "name":"akshay",
    "dob":"21/08/2000",
    "pan":"GHIJK5678L",
    "salaryEarned":12000,
    "allownces":2000,
    "pensionType":"Family",
    "bankName":"DEF",
    "accNo":987654321,
    "bankType":"Private"
  }

Run Delete Details method by http://localhost:8081/111122223333


#Process Pension Microservice

Run hello method by http://localhost:8080/

Run Get Pension method by http://localhost:8080/111122223333
