package ad.spring.webapp;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idPokemon;

    private String nombrePokemon;
    private double poder;

    @ManyToMany(mappedBy = "pokemons")
    private Set<Ability> abilitySet = new HashSet<>();

    public Pokemon(long id, String nombrePokemon, double poder, Set<Ability> abilitySet) {
        this.idPokemon = id;
        this.nombrePokemon = nombrePokemon;
        this.poder = poder;
        this.abilitySet = abilitySet;
    }

    public long getIdPokemon() {
        return idPokemon;
    }

    public void setIdPokemon(long idPokemon) {
        this.idPokemon = idPokemon;
    }

    public String getNombrePokemon() {
        return nombrePokemon;
    }

    public void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = poder;
    }

    public Set<Ability> getAbilitySet() {
        return abilitySet;
    }

    public void setAbilitySet(Set<Ability> abilitySet) {
        this.abilitySet = abilitySet;
    }
    @Override
    public String toString() {
        return "Pokemon [idPokemon= " + idPokemon + ", nombrePokemon= " + nombrePokemon + ", poder=" + poder + "]";
    }
}
