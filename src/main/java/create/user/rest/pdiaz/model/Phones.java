package create.user.rest.pdiaz.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "phones")
public class Phones{
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)s
    private final long idPhone;
    private final int phoneNumber;
    private final int cityCode;
    private final int countryCode;
	public Phones(long idPhone, int phoneNumber, int cityCode, int countryCode) {
		this.idPhone = idPhone;
		this.phoneNumber = phoneNumber;
		this.cityCode = cityCode;
		this.countryCode = countryCode;
	}
	public long getIdPhone() {
		return idPhone;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public int getCityCode() {
		return cityCode;
	}
	public int getCountryCode() {
		return countryCode;
	}

}

