package dialga.shiny.tutorial.tutorial.elements.atmosphere;

import dialga.shiny.tutorial.tutorial.elements.StageElement;
import org.bukkit.entity.Player;

/**
 * Created by ElectroidFilms on 6/27/15.
 */
public class ResetRelativeWeatherElement extends StageElement {

    public ResetRelativeWeatherElement(String delay) {
        super(delay);
    }

    @Override
    public void preform(Player viewer) {
        viewer.resetPlayerWeather();
    }

}