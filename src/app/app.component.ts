import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { registerLocaleData } from '@angular/common';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})


export class AppComponent {
  data: any;
  constructor(private http: HttpClient) {}
  ngOnInit() {
    this.makeApiResponse();
    this.makeApiRequest();
  }
  makeApiRequest() {
    this.http.get('http://localhost:8082/api/libros').subscribe(
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
makeApiResponse(){
  const registro={
    name: 'Luis',
    mail:'luis@gmail.com',
    password:'12345',
    libro_id:'7'

  }
  this.http.post('http://localhost:8082/api/usuarios',registro).subscribe(
    (response) =>{
     this.data = response;
     console.log("usuario nuevo" + response);
    }
  )

}
}


