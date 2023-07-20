import { Component } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent {
  id:any;
  products:any

  updateproduct(){
    let response=this.service.updateproduct(this.tempproduct);
    response.subscribe();
    this.EditEnable=false
    this.getEnable=true
  }

  deleteproduct(id:number){
    let response=this.service.deleteproduct(id);
    response.subscribe()
    this.ngOnInit()
    this.ngOnInit()
    this.EditEnable=false
  }
  
  EditEnable=false
  getEnable=true
  tempproduct={
    "id":0,
    "name":"",
    "cost":0
  }
  editproduct(product:any){
    this.tempproduct=product;
    this.EditEnable=true
    this.getEnable=false
  }

  constructor(private service:ProductService) { }


  //by default if we dont need any function to be called then we need to write the code below
  ngOnInit(): void {
    let response=this.service.getproducts();
    response.subscribe((data:any)=>this.products=data);
  }
}
