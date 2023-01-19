import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { registerLocaleData } from '@angular/common';
import { MatTableDataSource } from '@angular/material/table';
import { Libros } from 'src/models/libros';
import { AuthenticationService } from './authentication.service';
import { Router } from '@angular/router';

export interface PeriodicElement {
  name: string;
  position: number;
  weight: number;
  symbol: string;
}


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})


export class AppComponent {
  user: string = "";
  password: string = "";
  errorMessage: string | undefined;
  constructor(private authService: AuthenticationService, private router: Router) { }

  ngOnInit(): void {
  }
  onSubmit() {
    this.authService.login(this.user, this.password)
      .subscribe(
        success => {
          if (success) {
            // redirigir al usuario a la página principal
          } else {
            this.errorMessage = 'Usuario o contraseña inválidos';
          }
        },
        error => {
          this.errorMessage = 'Ocurrió un error al intentar iniciar sesión';
          console.log(error);
        }
      );
  }
}


