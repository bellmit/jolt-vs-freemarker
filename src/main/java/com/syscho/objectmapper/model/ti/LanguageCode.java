
package com.syscho.objectmapper.model.ti;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;


/**
 * LanguageCode
 * <p>
 * 
 * 
 */
@Generated("jsonschema2pojo")
public enum LanguageCode {

    AA("aa"),
    AB("ab"),
    AF("af"),
    AK("ak"),
    SQ("sq"),
    AM("am"),
    AR("ar"),
    AN("an"),
    HY("hy"),
    AS("as"),
    AV("av"),
    AE("ae"),
    AY("ay"),
    AZ("az"),
    BA("ba"),
    BM("bm"),
    EU("eu"),
    BE("be"),
    BN("bn"),
    BH("bh"),
    BI("bi"),
    BS("bs"),
    BR("br"),
    BG("bg"),
    MY("my"),
    CA("ca"),
    CH("ch"),
    CE("ce"),
    ZH("zh"),
    CU("cu"),
    CV("cv"),
    KW("kw"),
    CO("co"),
    CR("cr"),
    CS("cs"),
    DA("da"),
    DV("dv"),
    NL("nl"),
    DZ("dz"),
    EN("en"),
    EO("eo"),
    ET("et"),
    EE("ee"),
    FO("fo"),
    FJ("fj"),
    FI("fi"),
    FR("fr"),
    FY("fy"),
    FF("ff"),
    KA("ka"),
    DE("de"),
    GD("gd"),
    GA("ga"),
    GL("gl"),
    GV("gv"),
    EL("el"),
    GN("gn"),
    GU("gu"),
    HT("ht"),
    HA("ha"),
    HE("he"),
    HZ("hz"),
    HI("hi"),
    HO("ho"),
    HR("hr"),
    HU("hu"),
    IG("ig"),
    IS("is"),
    IO("io"),
    II("ii"),
    IU("iu"),
    IE("ie"),
    IA("ia"),
    ID("id"),
    IK("ik"),
    IT("it"),
    JV("jv"),
    JA("ja"),
    KL("kl"),
    KN("kn"),
    KS("ks"),
    KR("kr"),
    KK("kk"),
    KM("km"),
    KI("ki"),
    RW("rw"),
    KY("ky"),
    KV("kv"),
    KG("kg"),
    KO("ko"),
    KJ("kj"),
    KU("ku"),
    LO("lo"),
    LA("la"),
    LV("lv"),
    LI("li"),
    LN("ln"),
    LT("lt"),
    LB("lb"),
    LU("lu"),
    LG("lg"),
    MK("mk"),
    MH("mh"),
    ML("ml"),
    MI("mi"),
    MR("mr"),
    MS("ms"),
    MG("mg"),
    MT("mt"),
    MN("mn"),
    NA("na"),
    NV("nv"),
    NR("nr"),
    ND("nd"),
    NG("ng"),
    NE("ne"),
    NN("nn"),
    NB("nb"),
    NO("no"),
    NY("ny"),
    OC("oc"),
    OJ("oj"),
    OR("or"),
    OM("om"),
    OS("os"),
    PA("pa"),
    FA("fa"),
    PI("pi"),
    PL("pl"),
    PT("pt"),
    PS("ps"),
    QU("qu"),
    RM("rm"),
    RO("ro"),
    RN("rn"),
    RU("ru"),
    SG("sg"),
    SA("sa"),
    SI("si"),
    SK("sk"),
    SL("sl"),
    SE("se"),
    SM("sm"),
    SN("sn"),
    SD("sd"),
    SO("so"),
    ST("st"),
    ES("es"),
    SC("sc"),
    SR("sr"),
    SS("ss"),
    SU("su"),
    SW("sw"),
    SV("sv"),
    TY("ty"),
    TA("ta"),
    TT("tt"),
    TE("te"),
    TG("tg"),
    TL("tl"),
    TH("th"),
    BO("bo"),
    TI("ti"),
    TO("to"),
    TN("tn"),
    TS("ts"),
    TK("tk"),
    TR("tr"),
    TW("tw"),
    UG("ug"),
    UK("uk"),
    UR("ur"),
    UZ("uz"),
    VE("ve"),
    VI("vi"),
    VO("vo"),
    CY("cy"),
    WA("wa"),
    WO("wo"),
    XH("xh"),
    YI("yi"),
    YO("yo"),
    ZA("za"),
    ZU("zu");
    private final String value;
    private final static Map<String, LanguageCode> CONSTANTS = new HashMap<String, LanguageCode>();

    static {
        for (LanguageCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    LanguageCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static LanguageCode fromValue(String value) {
        LanguageCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
