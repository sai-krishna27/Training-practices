import { Component,EventEmitter,Input,OnInit,Output } from '@angular/core';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit{
  name="sai"
  ishidden=false
 isdisabled=false
 isactive=false
 active:object={
  color:"green",
  backgroundColor:"yellow"
 }

 count=0;
increment(){this.count+=1;}
decrement(){this.count-=1;};


text:object={}

changeStyle(){
    this.text={
      color:"green",
      backgroundColor:"yellow"
     }
  }


getRef(ref:any){
  console.log(ref.value)
}

twoway=""

display=false

color="red"

animals=["hen","cow","goat","sheep"]

@Input() public parentdata:any;
@Output() childData:any=new EventEmitter();

sendData(){
  this.childData.emit("Imported from child");
}

jsonobj={
  "name":"sai",
  "age":23
}
date=new Date()

employees:any;
empservice;
constructor(_employeeservice:EmployeeService)
{
  this.empservice=_employeeservice
}
/*ngOnInit(){
  this.employees=this.empservice.getEmployees()
}*/
ngOnInit(){
  this.empservice.getEmployees().subscribe(data=>this.employees=data)
  console.log( this.empservice.getEmployees())
}

radiodata=""
capital=""
show=true
getform="admin"

num1:number=0
num2:number=0
opr=""
}




