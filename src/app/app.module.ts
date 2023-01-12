
import { NgModule } from '@angular/core'
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { MatTableModule } from '@angular/material/table';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { LoginComponent } from "./login/login.component";
import { RegistroUsuarioComponent } from './components/registro-usuario/registro-usuario.component';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatSelectModule} from '@angular/material/select';
@NgModule({
    declarations: [
        AppComponent,
        LoginComponent,
        RegistroUsuarioComponent
          ],
    providers: [],
    bootstrap: [AppComponent],
    imports: [
        BrowserModule,
        AppRoutingModule,
        HttpClientModule,
        BrowserAnimationsModule,
        FormsModule,
        MatTableModule,
        MatFormFieldModule,
        MatSelectModule
        
    ]
})
export class AppModule { }
