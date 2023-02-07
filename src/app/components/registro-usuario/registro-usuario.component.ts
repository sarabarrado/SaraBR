
import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

export interface User {
  name: string;
  password: string;
  email: string,
  }
@Component({
  selector: 'app-registro-usuario',
  templateUrl: './registro-usuario.component.html',
  styleUrls: ['./registro-usuario.component.css']
})

export class RegistroUsuarioComponent implements OnInit {
  user!: FormGroup;
  data: any;
  constructor(private http:HttpClient) { }

  ngOnInit(): void {
    this.user = new FormGroup({
      username: new FormControl(''),
      email: new FormControl(''),
      password: new FormControl('')
    });
  }

  register() {
    if (this.user.valid) {
      const user = {
        username: this.user.value.username,
        email: this.user.value.email,
        password: this.user.value.password
      };
      console.log(user);
  
      // Aquí debes enviar los datos de registro de usuario a tu API
      // Por ejemplo, llamando a un servicio de usuarios
      this.http.post('http://localhost:8082/api/usuarios',user).subscribe(
        (response) =>{
         this.data = response;
         console.log("usuario nuevo" + response);
        }
      )
    }
  }

}
