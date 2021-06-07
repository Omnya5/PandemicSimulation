package pl.strzygowska.pandemicsimulation.model;

import javax.persistence.*;
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

    @Column(name = "name", unique = true, nullable = false)
    private String N;

    @Column(name = "population", nullable = false)
    private Long P;

    @Column(name = "infected", nullable = false)
    private Long I;

    @Column(name = "rate", nullable = false)
    private Float R;

    @Column(name = "mortality_rate", nullable = false)
    private Float M;

    @Column(name = "infection_time", nullable = false)
    private Integer Ti;

    @Column(name = "mortality_time", nullable = false)
    private Integer Tm;

    @Column(name = "simulation_time", nullable = false)
    private Integer Ts;

    public Simulation() {
    }

    public Simulation(String N, Long P, Long I, Float R, Float M,
                      Integer Ti, Integer Tm, Integer Ts) {
        this.N = N;
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

    public String getN() {
        return N;
    }

    public void setN(String N) {
        this.N = N;
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
