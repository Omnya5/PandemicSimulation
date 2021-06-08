package pl.strzygowska.pandemicsimulation.model;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "simulations")
public class Simulation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "simulation", cascade = CascadeType.ALL)
    private List<PandemicDay> pandemicDays = new ArrayList<>();

    @Column(name = "name", unique = true)
    @NotBlank(message = "Please enter name of simulation")
    @Size(max = 255, message = "name must have maximum 255 characters")
    private String n;

    @Column(name = "population")
    @NotNull(message = "Please enter population size")
    @Min(value = 1, message = "Population size must be greater than 1")
    private Long P;

    @Column(name = "infected")
    @NotNull(message = "Please enter number of infected")
    @Min(value = 1, message = "Number of infected must be greater than 1")//TODO: infected < population
    private Long I;

    @Column(name = "rate")
    @NotNull(message = "Please enter infection rate")
    @Min(value = 0, message = "Infection rate must be greater than 0")
    @Max(value = 1000000000, message = "Infection rate must be less than 1000000000")
    private Float R;

    @Column(name = "mortality_rate")
    @NotNull(message = "Please enter mortality rate")
    @Min(value = 0, message = "Mortality rate must be equal or greater than 0")
    @Max(value = 1, message = "Mortality rate must be less than 1")
    private Float M;

    @Column(name = "infection_time")
    @NotNull(message = "Please enter infection time")
    @Min(value = 0, message = "Infection time must be greater than 0")
    @Max(value = 1000000000, message = "Infection time must be less than 1000000000")
    private Integer Ti;

    @Column(name = "mortality_time")
    @NotNull(message = "Please enter mortality time")
    @Min(value = 0, message = "Mortality time must be greater than 0")
    @Max(value = 1000000000, message = "Mortality time must be less than 1000000000")//TODO: tm < ti
    private Integer Tm;

    @Column(name = "simulation_time")
    @NotNull(message = "Please enter simulation time")
    @Min(value = 0, message = "Simulation time must be greater than 0")
    @Max(value = 1000000000, message = "Simulation time must be less than 1000000000")
    private Integer Ts;

    public Simulation() {
    }

    public Simulation(String n, Long P, Long I, Float R, Float M,
                      Integer Ti, Integer Tm, Integer Ts) {
        this.n = n;
        this.P = P;
        this.I = I;
        this.R = R;
        this.M = M;
        this.Ti = Ti;
        this.Tm = Tm;
        this.Ts = Ts;
    }

    public List<PandemicDay> getPandemicDays() {
        return pandemicDays;
    }

    public void setPandemicDays(List<PandemicDay> pandemicDays) {
        this.pandemicDays = pandemicDays;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getn() {
        return n;
    }

    public void setn(String n) {
        this.n = n;
    }

    public Long getP() {
        return P;
    }

    public void setP(Long P) {
        this.P = P;
    }

    public Long getI() {
        return I;
    }

    public void setI(Long I) {
        this.I = I;
    }

    public Float getR() {
        return R;
    }

    public void setR(Float R) {
        this.R = R;
    }

    public Float getM() {
        return M;
    }

    public void setM(Float M) {
        this.M = M;
    }

    public Integer getTi() {
        return Ti;
    }

    public void setTi(Integer Ti) {
        this.Ti = Ti;
    }

    public Integer getTm() {
        return Tm;
    }

    public void setTm(Integer Tm) {
        this.Tm = Tm;
    }

    public Integer getTs() {
        return Ts;
    }

    public void setTs(Integer Ts) {
        this.Ts = Ts;
    }
}
