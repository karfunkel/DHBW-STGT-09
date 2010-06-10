class ShiroUser {
  String username
  String email
  String passwordHash

  static hasMany = [roles: ShiroRole, permissions: String]

  static constraints = {
    username(nullable: false, blank: false)
  }
}
