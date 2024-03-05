package Entity.Users;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class User {

    @NonNull private String firstName;
    @NonNull private String secondName;
    @NonNull private String address;
    @NonNull private Integer passport;
    private boolean verified;
}
