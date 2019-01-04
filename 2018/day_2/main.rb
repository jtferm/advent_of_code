require_relative 'lib/checksum'
require_relative 'lib/box_id'

ids = []
File.open('input.txt', 'r') do |f|
  while line = f.gets
    ids << line
  end
end

checksum = Checksum.new(ids)

puts checksum.compute
