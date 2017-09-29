package com.paris.backend.model;

import javax.persistence.*;

/**
 * Created by HE on 2017/9/27 0027.
 * 比分表
 */
@Entity
@Table(name = "HzZuSaiBifen")
public class HzZuSaiBifen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "fen_id")
    private int id;

    @Column(name = "sc_id")
    private int sc_id;      //赛程ID



}
