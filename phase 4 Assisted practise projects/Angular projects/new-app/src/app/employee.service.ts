import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  /*for service(dependency injection)*/
  /*constructor() { }

  getEmployees(){
    return [
      {
        "name":"sai","age":23,"id":1
      },
      {
        "name":"mark","age":24,"id":2
      },
      {
        "name":"chris","age":25,"id":3
      }
    ]
  }*/
  constructor(private http:HttpClient) { }
  url="../assets/employees.json"
  
  getEmployees():Observable<Employee[]>{
    return this.http.get<Employee[]>(this.url);
  }

  
}
