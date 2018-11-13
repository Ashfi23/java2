
import java.util.logging.Logger;


public class Pegawai {
    private String TxtId;
    private String TxtNama;
    private String TxtGender;
    private String TxtTpt_lahir;
    private String txtTgl_lahir;
    private String TxtAlamat;
    private String TxtTelepon;
    private static final Logger LOG = Logger.getLogger(Pegawai.class.getName());

    
    public Pegawai(String TxtId, String TxtNama, String TxtGender, String TxtTpt_lahir, String txtTgl_lahir, String TxtAlamat, String TxtTelepon) {
        this.TxtId = TxtId;
        this.TxtNama = TxtNama;
        this.TxtGender = TxtGender;
        this.TxtTpt_lahir = TxtTpt_lahir;
        this.txtTgl_lahir = txtTgl_lahir;
        this.TxtAlamat = TxtAlamat;
        this.TxtTelepon = TxtTelepon;
    }

    

   
   

    public String getTxtId() {
        return TxtId;
    }

    public void setTxtId(String TxtId) {
        this.TxtId = TxtId;
    }

    public String getTxtNama() {
        return TxtNama;
    }

    public void setTxtNama(String TxtNama) {
        this.TxtNama = TxtNama;
    }

    public String getTxtGender() {
        return TxtGender;
    }

    public void setTxtGender(String TxtGender) {
        this.TxtGender = TxtGender;
    }

    public String getTxtTpt_lahir() {
        return TxtTpt_lahir;
    }

    public void setTxtTpt_lahir(String TxtTpt_lahir) {
        this.TxtTpt_lahir = TxtTpt_lahir;
    }

    public String getTxtTgl_lahir() {
        return txtTgl_lahir;
    }

    public void setTxtTgl_lahir(String txtTgl_lahir) {
        this.txtTgl_lahir = txtTgl_lahir;
    }

    public String getTxtAlamat() {
        return TxtAlamat;
    }

    public void setTxtAlamat(String TxtAlamat) {
        this.TxtAlamat = TxtAlamat;
    }

    public String getTxtTelepon() {
        return TxtTelepon;
    }

    public void setTxtTelepon(String TxtTelepon) {
        this.TxtTelepon = TxtTelepon;
    }
    
    
    
}
