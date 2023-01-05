import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})


export class AppComponent {

  constructor(private http: HttpClient) {}
  ngOnInit() {
    this.makeApiRequest();
  }
  makeApiRequest() {
    this.http.get('localhost:8082/api/usuarios').subscribe(
      (response) => {
        console.log("lo que devuelve de usuarios: " + response);
        // procesar la respuesta de la API
      },
      (error) => {
        console.log("error: " + error);
      }
    );
}
}
