import { Component } from '@angular/core';
import { Product } from 'Product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {
  product:Product=new Product();
  message=""
  addProduct(){
    let response=this.service.addProduct(this.product)
    response.subscribe();
    this.message="product is added"
  }
  constructor(private service:ProductService) { }
}
