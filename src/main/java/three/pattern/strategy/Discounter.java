package three.pattern.strategy;

import java.math.BigDecimal;
//abstract klasa -> klasa : abstract metode
//interface je još veća apstrakcija od apstraktne

/**
 * Java 1.8 uvodi special interface.
 * FUNCTIONAL INTERFACE
 * <p>Šta je to FUNCTIONAL INTERFACE i kako se razlikuje od INTERFACE ? </p>
 * Funkcionalni interfejs -> interfejs koji ima JEDNU I SAMO JEDNU apstraktnu metodu.
 * MRŠAVI ili THIN
 *
 * Ovi ostali koji imaju više apstraktnih metoda su tzv DEBELI ili THICK
 */
@FunctionalInterface
public interface Discounter {
    //uzme punu cijenu , aplicira popust i vrati s popustom
    BigDecimal applyDiscount(BigDecimal fullAmount);

//    BigDecimal getDiscountPercentage();
}
