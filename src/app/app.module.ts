
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
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatSelectModule } from '@angular/material/select';
import { MatButtonModule } from '@angular/material/button';
import { LibrosComponent } from './components/libros/libros.component';
import { MatSidenavModule } from '@angular/material/sidenav';
import { AutoresComponent } from './components/autores/autores.component';
import { MatInputModule } from '@angular/material/input';
import { MatIconModule } from '@angular/material/icon';
import { UsuariosComponent } from './components/usuarios/usuarios.component';
import {MatCardModule} from '@angular/material/card';
import { HomeComponent } from './components/home/home.component';

import {MatToolbarModule} from '@angular/material/toolbar';

import {MatListModule} from '@angular/material/list';

@NgModule({
    declarations: [
        AppComponent,
        LoginComponent,
        RegistroUsuarioComponent,
        LibrosComponent,
        AutoresComponent,
        UsuariosComponent,
        HomeComponent,

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
        MatSelectModule,
        MatButtonModule,
        MatSidenavModule,
        MatInputModule,
        MatIconModule,
        MatCardModule,
        MatToolbarModule,
    MatButtonModule,
    MatListModule


    ]
})
export class AppModule { }
