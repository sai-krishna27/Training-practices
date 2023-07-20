import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http:HttpClient) { }


  public addProduct(product:any){
    return this.http.post("http://localhost:3000/products",product,{responseType:'text' as 'json'});
  }

  public getproducts(){
    return this.http.get("http://localhost:3000/products");
  }


  public deleteproduct(id:any){
    return this.http.delete("http://localhost:3000/products/"+id);
  }


  public updateproduct(product:any){
    return this.http.put("http://localhost:3000/products/"+product.id,product,{responseType:'text' as 'json'});
  }

}
