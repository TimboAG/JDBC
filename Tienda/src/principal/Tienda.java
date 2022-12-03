package principal;

import servicio.TiendaServicio;

public class Tienda {

    public static void main(String[] args) throws Exception {
        try {
            TiendaServicio miTienda = new TiendaServicio();
            miTienda.menu();
        } catch (Exception e) {
            throw e;
        }
    }
}