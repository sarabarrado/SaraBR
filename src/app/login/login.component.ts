import { Component, OnInit } from '@angular/core';
import { AuthenticationService } from '../authentication.service';
import { Router, ActivatedRoute, ParamMap } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
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
