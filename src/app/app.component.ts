import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { registerLocaleData } from '@angular/common';

export interface PeriodicElement {
  name: string;
  position: number;
  weight: number;
  symbol: string;
}

const ELEMENT_DATA: PeriodicElement[] = [
  {position: 1, name: 'Hydrogen', weight: 1.0079, symbol: 'H'},
  {position: 2, name: 'Helium', weight: 4.0026, symbol: 'He'},
  {position: 3, name: 'Lithium', weight: 6.941, symbol: 'Li'},
  {position: 4, name: 'Beryllium', weight: 9.0122, symbol: 'Be'},
  {position: 5, name: 'Boron', weight: 10.811, symbol: 'B'},
  {position: 6, name: 'Carbon', weight: 12.0107, symbol: 'C'},
  {position: 7, name: 'Nitrogen', weight: 14.0067, symbol: 'N'},
  {position: 8, name: 'Oxygen', weight: 15.9994, symbol: 'O'},
  {position: 9, name: 'Fluorine', weight: 18.9984, symbol: 'F'},
  {position: 10, name: 'Neon', weight: 20.1797, symbol: 'Ne'},
];

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})


export class AppComponent {
  data: any;
  displayedColumns: string[] = ['position', 'name', 'weight', 'symbol'];
  dataSource = ELEMENT_DATA;
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


