package com.alien.security.entity;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
//
//@Entity
//@Table(name = "refersh_token")
//@Data
//@Getter
//@Setter
//@AllArgsConstructor
//@RequiredArgsConstructor
//@Builder
//@ToString
//public class RefreshToken {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private int tokenID;
//	private String refreshToken;
//	private Instant expiry;
//	@OneToOne
//	private UserModel user;
//	@Override
//	public String toString() {
//	    return "RefreshToken{" +
//	            "refreshToken='" + refreshToken + '\'' +
//	            ", expiry=" + expiry +
//	            ", user=" + (user != null ? user.getUsername() : "null") +
//	            '}';
//	}
//
//}
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "refresh_token")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class RefreshToken {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tokenID;
	private String refreshToken;
	private Instant expiry;

	@OneToOne
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	@JsonIgnore
	private UserModel user;

	@Override
	public String toString() {
		return "RefreshToken{" +
				"refreshToken='" + refreshToken + '\'' +
				", expiry=" + expiry +
				", user=" + (user != null ? user.getUsername() : "null") +
				'}';
	}
}