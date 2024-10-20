package pe.upc.gastrogobackend.shared.domain.model.commands;
/**
 * @summary Command to renew a membership.
 */

public record RenewMembershipCommand(String membershipId, String userId, double price) {

}
