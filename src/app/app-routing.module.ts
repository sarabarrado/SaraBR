import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { AutoresComponent } from './components/autores/autores.component';
import { LibrosComponent } from './components/libros/libros.component';
import { RegistroUsuarioComponent } from './components/registro-usuario/registro-usuario.component';
import { UsuariosComponent } from './components/usuarios/usuarios.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
{ path: '', component: LoginComponent },
{ path: 'home', component: AppComponent },
{ path: 'libros', component: LibrosComponent },
{ path: 'autores', component: AutoresComponent },
{ path: 'usuarios', component: UsuariosComponent },
{ path: 'registro-usuarios', component: RegistroUsuarioComponent }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
