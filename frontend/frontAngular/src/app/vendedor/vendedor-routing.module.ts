import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { VendedorComponent } from './vendedor/vendedor.component';

const routes: Routes = [
  { path: '', component: VendedorComponent }

];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class VendedorRoutingModule { }
