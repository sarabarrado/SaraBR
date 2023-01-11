import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {
  private apiUrl = 'http://localhost:8082/api/usuarios';

  private users:any = {
    admin: 'password',
  };
  constructor(private http: HttpClient) { }
  login(username: string, password: string): Observable<boolean> {
    return this.http.post<any>(this.apiUrl, { username, password })
      .pipe(
        map(response => response.success)
      );
  }

  logout(): void {
    localStorage.removeItem('user');
  }
  isAuthenticated(): boolean {
    return localStorage.getItem('user') != null;
  }
}
