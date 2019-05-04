import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { MenuComponent } from './menu/menu.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { Routes,RouterModule } from '@angular/router';
import { DeleteComponent } from './delete/delete.component';
import { AddComponent } from './add/add.component';

const routes:Routes=[
  {path:'login',component:LoginComponent},
  {path:'menu',component:MenuComponent},
  {path:'add',component:AddComponent},
  {path:'delete',component:DeleteComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    MenuComponent,
    DeleteComponent,
    AddComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
