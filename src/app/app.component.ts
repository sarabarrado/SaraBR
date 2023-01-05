import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})


export class AppComponent {
  data: any;
  constructor(private http: HttpClient) {}
  ngOnInit() {
    this.makeApiRequest();
  }
  makeApiRequest() {
    this.http.get('http://localhost:8082/api/usuarios').subscribe(
      (response) => {
        this.data = response;
        console.log("lo que devuelve de usuarios: " + response);
        // procesar la respuesta de la API
      },
      (error) => {
        console.log("error: " + error);
      }
    );
}
}
