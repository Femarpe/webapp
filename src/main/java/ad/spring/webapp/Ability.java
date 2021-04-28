package ad.spring.webapp;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Ability {

    @Id
    @GeneratedValue
    private long idAbility;

    private String nombreAbility;
    private String efecto;

    @ManyToMany
    @JoinTable(name = "pokemmon_ability",
            joinColumns = @JoinColumn(name = "id_ability"),
            inverseJoinColumns = @JoinColumn(name = "id_pokemon")
    )
    private Set<Pokemon> pokemons = new HashSet<>();

    public Ability(long idAbility, String nombreAbility, String efecto, Set<Pokemon> pokemons) {
        this.idAbility = idAbility;
        this.nombreAbility = nombreAbility;
        this.efecto = efecto;
        this.pokemons = pokemons;
    }

    public long getIdAbility() {
        return idAbility;
    }

    public String getNombreAbility() {
        return nombreAbility;
    }

    public String getEfecto() {
        return efecto;
    }

    public Set<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setIdAbility(long idAbility) {
        this.idAbility = idAbility;
    }

    public void setNombreAbility(String nombreAbility) {
        this.nombreAbility = nombreAbility;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

    public void setPokemons(Set<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
    @Override
    public String toString() {
        return "Tramite [idAbility= " + idAbility + ", nombreAbility= " + nombreAbility + ", efecto =" + efecto + "]";
    }
}
