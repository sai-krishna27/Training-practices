import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterComponent } from './register/register.component';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule } from '@angular/forms';
import {  HttpClientModule } from '@angular/common/http';
import { ProductService } from './product.service';
import { ProductsComponent } from './products/products.component';

const routes:Routes=[
  {path:'add',component:RegisterComponent},
  {path:'products',component:ProductsComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    ProductsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(routes),
    FormsModule,
    HttpClientModule
  ],
  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
