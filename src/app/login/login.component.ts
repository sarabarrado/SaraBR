import { Component, OnInit } from '@angular/core';
import { AuthenticationService } from '../authentication.service';
import { Router, ActivatedRoute, ParamMap } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  username: string = "";
  password: string = "";

  constructor(private authService: AuthenticationService, route: Router) { }

  ngOnInit(): void {
  }
  onSubmit() {
    this.authService.login(this.username, this.password).subscribe(
      success => {
        if (success) {
          // Redirigir al usuario a la página principal
         // this.router.navigate(['/']);
        } else {
          // Mostrar mensaje de error
         // this.errorMessage = 'Usuario o contraseña incorrectos';
        }
      }
    );
  }

}
