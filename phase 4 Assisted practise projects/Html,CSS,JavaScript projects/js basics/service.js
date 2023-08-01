let s="output is ";

  //onclick implimentation
  function msg(){
    let a1=10;
    let a2=20;
    document.write(s+(a1+a2));
  }

  //prime number
  function prime(){
    let n=Number(prompt("enter a number"));
    console.log("number is "+n);
    var flag=true;
    for(var i=2;i<n;i++){
      console.log(i+" "+n+" "+flag)
      if(n%i==0){
        
        flag=false;
        console.log(i+" "+n+" "+flag)
        break;
      }
    }
    if(flag){
      alert(n+" is a prime number");
    }
    else{
      alert(n+" not is a prime number");
    }
  }

  //validation of form
  function checkValidationOfForm(){
                let name=document.f1.user.value;
                console.log("the name entered is "+name)


                let pass=document.f1.pwd.value;
                console.log("the password enetered is "+pass)


                if(name=="" || name.length<=6){
                    alert("invalid name")
                }
                else if(pass==""){
                    alert("password should not be empty")
                }
                else if(name==="admin@123"&&pass=="admin"){
                    document.write ("you are successfull authenticated")
                }
                else{
                    alert("pls check the credentials ")
                }
            }

  //validating registration

  function register(){
    let id=document.reg.id.value;
    let name=document.reg.name.value;
    let email=document.reg.email.value;
    let pass=document.reg.pass.value;
    let gender=document.reg.gender.value;
    let sport=document.reg.sport.value;
    let subject=document.reg.subs.value;
    let address=document.reg.address.value;
    let alrt="";
    if(id=="" ){
      alrt=alrt+"id,"
    }
    if(name==""){
      alrt=alrt+"name,"
    }
    
    if(email==""){
      alrt=alrt+"email,"
    }
    if(pass==""){
      alrt=alrt+"password,"
    }
    
    if(gender==""){
      alrt=alrt+"gender,"
    }
    if(sport.length==0){
      alrt=alrt+"sport,"
    }

    if(subject==""){
      alrt=alrt+"subject,"
    }
    if(address==""){
      alrt=alrt+"address"
    }

    if(alrt==""){
      alert("Registration Successful")
    }
    else{
      alert(alrt+" need to be filled")
    }

  }

  //validation using inner html
  function msg1(){


    var tag="<form name='f1'>username<input type='text' name='user'><br>password<input type='password' name='pwd'><br></form>";
    document.getElementById("place").innerHTML=tag
    }
    

  //alert boxes in java script