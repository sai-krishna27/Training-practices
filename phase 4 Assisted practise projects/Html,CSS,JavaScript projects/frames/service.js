

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
      document.getElementById("id").innerText="id is a required field"
    }else{
      document.getElementById("id").innerText=""
    }
    if(name==""){
      alrt=alrt+"name,"
      document.getElementById("name").innerText="name is a required field"
    }else{
      document.getElementById("name").innerText=""
    }
    
    if(email==""){
      alrt=alrt+"email,"
      document.getElementById("email").innerText="email is a required field"
    }else{
      document.getElementById("email").innerText=""
    }
    if(pass==""){
      alrt=alrt+"password,"
      document.getElementById("pass").innerText="password is a required field"
    }else{
      document.getElementById("pass").innerText=""
    }
    
    if(gender==""){
      alrt=alrt+"gender,"
      document.getElementById("gender").innerText="gender is a required field"
    }else{
      document.getElementById("gender").innerText=""
    }
    if(sport.length==0){
      alrt=alrt+"sport,"
      document.getElementById("sport").innerText="sport is a required field"
      console.log(sport.length)
    }else{
      document.getElementById("sport").innerText=""
    }

    if(subject==""){
      alrt=alrt+"subject,"
      document.getElementById("subs").innerText="subject is a required field"
    }else{
      document.getElementById("subs").innerText=""
    }
    if(address==""){
      alrt=alrt+"address"
      document.getElementById("address").innerText="address is a required field"
    }else{
      document.getElementById("address").innerText=""
    }

    if(alrt==""){
      alert("Registration Successful")
    }

  }
