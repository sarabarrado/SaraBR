import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { registerLocaleData } from '@angular/common';
import { MatTableDataSource } from '@angular/material/table';
import { Libros } from 'src/models/libros';

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
  data: any;
  displayedColumns: string[] = ['titulo', 'precio', 'genero'];
  
  
  constructor(private http: HttpClient) {}
  ngOnInit() {
    //this.makeApiResponse();
   this.makeApiRequest();
  }

  public listaLibros: Libros[] = []; 
  public dataSourceLibros = new MatTableDataSource();
  makeApiRequest() {
    this.http.get<any[]>('http://localhost:8082/api/libros').subscribe(
      response => {
        this.dataSourceLibros.data = response;
        console.log("lo que devuelve de usuarios: " + this.dataSourceLibros.data);
        
        // procesar la respuesta de la API
      },
    );
}


makeApiResponse(){
  const registro={
    name: 'Luis',
    mail:'luis@gmail.com',
    password:'12345',
    libro_id:7

  }
  this.http.post('http://localhost:8082/api/usuarios',registro).subscribe(
    (response) =>{
     this.data = response;
     console.log("usuario nuevo" + response);
    }
  )

}
}


