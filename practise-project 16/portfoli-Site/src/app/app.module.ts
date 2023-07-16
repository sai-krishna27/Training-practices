import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SigninComponent } from './signin/signin.component';
import { SignoutComponent } from './signout/signout.component';
import { RouterModule ,Routes} from '@angular/router';
import { HomeComponent } from './home/home.component';

const routes:Routes=[
  {path:'signin',component:SigninComponent},
  {path:'signout',component:SignoutComponent},
  {path:'',component:HomeComponent},
  {path:'home',component:HomeComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    SigninComponent,
    SignoutComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
