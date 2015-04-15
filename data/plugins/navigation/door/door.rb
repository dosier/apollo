java_import 'org.apollo.game.action.DistancedAction'

# A distanced action which opens a door.
class OpenDoorAction < DistancedAction
  include DoorConstants

  attr_reader :door

  def initialize(mob, door)
    super(0, true, mob, door.position, DOOR_SIZE)
    @door = door
  end

  def executeAction
    mob.turn_to(@door.position)
    DoorUtil::toggle(@door)
    stop
  end

  def equals(other)
    return (get_class == other.get_class && @door == other.door)
  end

end

# MessageListener for opening and closing doors.
on :message, :first_object_action do |player, message|
  if DoorUtil::is_door?(message.id)
    puts "Player: #{player.position}, door: #{message.position}"
    door = DoorUtil::get_door_object(message.position, message.id)
    DoorUtil::toggle(door) unless door.nil?
    # player.start_action(OpenDoorAction.new(player, door)) unless door.nil?
  end
end