import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { VendedorRoutingModule } from './vendedor-routing.module';
import { VendedorComponent } from './vendedor/vendedor.component';


@NgModule({
  declarations: [
    VendedorComponent
  ],
  imports: [
    CommonModule,
    VendedorRoutingModule
  ]
})
export class VendedorModule { }
