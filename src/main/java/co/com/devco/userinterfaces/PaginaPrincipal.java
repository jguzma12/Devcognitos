package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipal {
    public static final Target BTN_NOTA_ENRIQUECIDA = Target.the("Boton para una nota enriquecida").
            located(By.id("richtextnote-tab"));
    public static final Target BTN_NEGRILLA = Target.the("Boton para poner la letra en negrilla").
            located(By.xpath("(//*[@class='ck ck-icon ck-button__icon'])[7]"));
    public static final Target INPUT_EDITOR = Target.the("Input para ingresar la nota").
            located(By.id("editor"));
    public static final Target ALERTA = Target.the("Alerta indicadora de que si guardo").
            located(By.xpath("//*[@class='toast fade bg-success text-white hide']"));
    public static final Target BTN_GUARDAR = Target.the("Boton para guardar").
            located(By.xpath("//*[@class='btn save-file-btn saveNotesBtn richtextnoteBtn']"));




}
