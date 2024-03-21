/** 
* @author <Nguyen Chi Nghia - s3979170> 
*/

package Nikisurance.model;

import java.util.ArrayList;

public interface ClaimProcessManager {
    void add(Claim claim);

    void update(Claim claim);

    void delete(String claimId);

    Claim getOne(String claimId);

    ArrayList<Claim> getAll();
}
