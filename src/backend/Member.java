package backend;

public class Member implements TMC {

    private String memberId;
    private String name;
    private String membershipType;
    private String email;
    private String phoneNumber;
    private String status;

    public Member(String memberId, String name, String membershipType, String email, String phoneNumber,
            String status) {
        this.memberId = memberId;
        this.name = name;
        this.membershipType = membershipType;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String key) {
        this.status = key;
    }

    @Override
    public String lineRepresentation() {

        return memberId + "," + name + "," + membershipType + "," + email + "," + phoneNumber + "," + status;

    }

    @Override
    public String getSearchKey() {
        return memberId;
    }
}
